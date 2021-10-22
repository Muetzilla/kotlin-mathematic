package termevaluator


fun main(args: Array<String>) {
    var enteredTerm = ""
    val termevaluator = PrepareTerm()
    print("Please enter your term > ")
    enteredTerm = readLine().toString()
    print("Your term is: $enteredTerm")
    termevaluator.parseIntsFromTerm(enteredTerm)
}
