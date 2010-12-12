puts "Welcome:"
guess = '-1'
answer = rand(10)
while guess.to_i != answer
  puts "Enter your guess"
  guess = gets
  if guess.to_i > answer
    puts "lower that a #{guess}"
  end
  if guess.to_i < answer
    puts "higher that a #{guess}"
  end         
end
puts "Nice."