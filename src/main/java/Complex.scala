/**
  * Created by Sean Emerson on 08-06-2016.
  */
class Complex (real: Double, imaginary: Double){
  def re = real
  def im = imaginary
  override def toString () = "" + re +(if (im < 0) "" else "+") + im + "i"
}
