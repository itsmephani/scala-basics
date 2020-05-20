case class Kid(name: String)
case class Game(name: String)
class Plays[A, B](val a: A, val b: B)

def kidPlays(kidPlaying: Kid Plays Game) =
  //Notice our type: Person loves Person!
  kidPlaying.a.name + " is playing " + kidPlaying.b.name

val kid = new Kid("Rohit")
val game = new Game("Cricket")

kidPlays(new Plays(kid, game))
