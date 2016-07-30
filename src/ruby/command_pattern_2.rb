# Use the proc object if the actions are very straight forward. But use command classes
# if the command will carry around a lot of state information. 
class SlickButton
  attr_accessor :command

  def initialize(&block)
    @command = block
  end

  # ...

  def on_button_push
    @command.call if @command
  end
end

new_button = SlickButton.new do
  # create a new document
end
