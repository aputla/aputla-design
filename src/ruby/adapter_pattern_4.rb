# Modify an instance of a class

bto = BritishTextObject.new("hello", 50.8, :blue)

class << bto
  def color
    colour
  end

  def text
    string
  end

  def size_inches
    return size_mm / 25.4
  end
end

# OR

def bto.color
  colour
end

def bto.text
  string
end
