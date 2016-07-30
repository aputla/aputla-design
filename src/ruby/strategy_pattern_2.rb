class Context
  def initialize(&strategy)
    @strategy = strategy
  end

  def doit
    @strategy.call
  end
end

strategy1 = lambda do 
  puts "doit one"
end
strategy2 = lambda do
  puts "doit two"
end
strategy3 = Proc.new do 
  puts "doit three"
end
Context.new(&strategy1).doit
Context.new(&strategy2).doit
Context.new(&strategy3).doit
