import scala.math.sqrt

object caseclass extends App{
	val p1=Point(1,1)
	val p2=Point(4,5)
	//move
	val p3=p1.move(2,2)
	println("moving of a point => "+p3)

	//+
	println("addition of two points => "+p1+p2)

	//invert
	val p4=p2.invert()
	println("inversion of a point => "+p4)

	//distance
	println("distance between two points => "+p1.distance(p2))

	
}

case class Point(a:Int,b:Int){
	def x: Int = a
	def y: Int = b
	def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
	def +(that:Point)=Point(this.x+that.x,this.y+that.y)
	def invert()=Point(this.y,this.x)
	def distance(that:Point)=sqrt( (this.x-that.x)*(this.x-that.x) + (this.y-that.y)*(this.y-that.y) )
}