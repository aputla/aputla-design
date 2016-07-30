class Report
  def display
    display_header
    display_body
    display_footer 
  end

  def display_header
    raise "invalid call"
  end

  def display_body
    raise "invalid call"
  end

  def display_footer
    raise "invalid call"
  end
end

class HTMLReport
  def display_header
  end

  def display_body
  end

  def display_footer
  end
end

class TextReport
  def display_header
  end

  def display_body
  end

  def display_footer
  end
end

report = HTMLReport.new
report.display
report = TextReport.new
report.display
