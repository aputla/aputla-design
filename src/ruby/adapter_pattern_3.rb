# Reload the class and add additional methods to conform to the interface

class Renderer
  def render(text_object)
    text = text_object.text
    size = text_object.size_inches
    color = text_object.color
    # render the text
  end
end

class TextObject
  attr_reader :text, :size_inches, :color

  def initialize(text, size_inches, color)
    @text = text
    @size_inches = size_inches
    @color = color
  end
end

class BritishTextObject
  attr_reader :string, :size_mm, :colour
end

require "british_text_object"

class BritishTextObject
  def color
    return colour
  end

  def text
    return string
  end

  def size_inches
    return size_mm / 25.4
  end
end
