scalaVersion := "2.11.6"

initialCommands in console :=
  """|val repl = REPLesent(0,0,"src/main/repl/2015-ll-monads.txt",intp=$intp)
     |import repl._
  """.stripMargin

shellPrompt := { state =>
  import scala.Console.{CYAN,RESET}
  val p = Project.extract(state)
  val name = p.getOpt(sbt.Keys.name) getOrElse p.currentProject.id
  s"[$CYAN$name$RESET] $$ "
}
