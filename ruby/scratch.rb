array = ['a','b','c']
hash = {}
array.each do |i|   
  puts "adding #{i} to #{array.index(i)}" 
  hash["#{array.index(i)}"] = i
  end    
puts hash.to_s

