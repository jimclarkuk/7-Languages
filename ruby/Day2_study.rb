## Working with arrays
# array = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
# subarr=[]
# array.inject(0) do |count, i| 
#   subarr.push(i)
#   if subarr.size == 4
#     puts subarr.to_s
#     subarr.clear
#   end
# end                
# 
# require 'enumerator'  
# array.each_slice(4) {|i| puts i.to_s}     

# Tree
# {'grandpa' => {'dad' => {'child 1' => {}, 'child 2' => {}}, 'uncle' => {'child 3' => {}, 'child 4' => {}}}}

# class Tree
#   attr_accessor :children, :node_name
#   
#   def initialize(person)
#     # puts "initialising #{person}"
#     @children = []
#     person.each_pair do |name, kids|       
#       # puts "#{name} has children #{kids}"
#       @node_name = name
#       kids.each do |child| 
#         # puts "#{child}"
#         children.push(Tree.new({child[0], child[1]}))
#       end
#     end
#   end
#   
#   def visit_all(&block)
#     visit &block    
#     children.each {|c| c.visit_all &block}
#   end
#   
#   def visit(&block) 
#     block.call self
#   end
# end
# 
# family_tree = Tree.new({'grandpa' => {'dad' => {'child 1' => {}, 'child 2' => {}}, 'uncle' => {'child 3' => {}, 'child 4' => {}}}})
# 
# puts "visiting a node" 
# family_tree.visit {|node| puts node.node_name}
# puts
# 
# puts "visiting entire tree"
# family_tree.visit_all {|node| puts node.node_name}

## grepping

File.open("input.txt", 'r') {|f| f.each {|line| puts line unless (line.to_s =~ /this.*/) == nil}}