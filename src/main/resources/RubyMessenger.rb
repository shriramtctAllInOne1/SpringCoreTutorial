class RubyMessenger
  def setMessage(m)
    @@message = m
  end

  def getMessage
    @@message
  end
end

RubyMessenger.new