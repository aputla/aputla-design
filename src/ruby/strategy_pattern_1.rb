class ConcreteStrategy1
  def doit
    puts "doit one"
  end
end

class ConcreteStrategy2
  def doit
    puts "doit two"
  end
end

class Context
  def initialize(strategy)
    @strategy = strategy
  end

  def doit
    @strategy.doit
  end
end

strategy1 = ConcreteStrategy1.new
strategy2 = ConcreteStrategy2.new
Context.new(strategy1).doit
Context.new(strategy2).doit
