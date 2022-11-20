package bridge

private const val OK =false
private const val WRONG= true

object ValidChecker {

    fun checkBridgeSize(size:Int):Boolean{
        if(size in 3..20){
            return OK
        }
        return WRONG
    }
    fun checkUorD(choice:String){
        if(choice!="U" && choice!="D"){
            throw IllegalArgumentException()
        }
    }
}