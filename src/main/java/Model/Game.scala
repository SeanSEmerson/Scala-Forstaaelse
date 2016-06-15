package Model

/**
  * Created by Sean Emerson on 15-06-2016.
  */
class Game (_title: String, _platform: String, _completed: Boolean) {
  def title = _title
  def platform = _platform
  def completed = _completed

  override def toString(): String =  ("" + title + " " + platform)
}
