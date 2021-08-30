import scala.math.{sqrt,pow}


object case_class extends App{
    case class Point(a:Int, b:Int){
        def x: Int = a
        def y: Int = b
        def +(r : Point) = new Point(this.x + r.x,this.y + r.y)
        def move(c: Int, d: Int) = new Point(this.x + c,this.y + d)
        def distance(other: Point): Double = sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
        def Invert() = new Point(this.y,this.x)
        def Print : String = x.toString + "   " + y.toString
    }
    def dis(a : Point, b : Point) : Double = sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2))

    val X = new Point(1,2)
    val Y = new Point(3,4)
    println((X+Y).Print)
    println((X+Y).Print)
    println(X.Print)
    println(Y.Print)
    println(X.move(1,1).Print)
    val Z = X.move(1,1)
    println(Z.Print)
    println(X.distance(Y))
    println(dis(X,Y))
    val W = X.Invert()
}