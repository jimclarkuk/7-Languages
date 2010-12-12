class CsvRow

  def method_missing(method, *args, &block)
    @fields[method.to_s]
  end
    
  def initialize(headers, line)
    @line = line        
    @fields = {}
    bits = line.split(', ')
    headers.each {|header| @fields[header] = bits[headers.index header]}
  end
  
  def fields
    @fields
  end
  
end
    
class ActsAsCsv
  def self.acts_as_csv
    
    define_method 'read' do
      file = File.new(self.class.to_s.downcase + '.csv')
      @headers = file.gets.chomp.split(', ')
      @rows = []
      file.each do |row|
        @rows << CsvRow.new(@headers, row)
      end
    end
    
    define_method "headers" do
      @headers
    end
    
    define_method "csv_contents" do
      @result
    end
    
    define_method 'initialize' do
      @result = []
      read
    end
  end
end

class RubyCsv2 < ActsAsCsv
  acts_as_csv
  def each (&block)
    @rows.each {|row| block.call row} 
  end
end    

csv = RubyCsv2.new
csv.each {|row| puts row.one}

# row = CsvRow.new(["one", "two"], "tiger, lion")
# row.one