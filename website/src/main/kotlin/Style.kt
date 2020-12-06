import kotlinx.css.*
import kotlinx.css.properties.*
import react.RBuilder
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ComponentStyles : StyleSheet("") {
    val wrapper:RuleSet by css {
        background="red"
//        child("parallax"){
//            child("#stars1"){
//            width = LinearDimension("20")
//            height = LinearDimension("20")
//            borderRight = "50%"
//            background = "Blue"
//                boxShadow= BoxShadows().also {  }
//            animation("animStar",Time("150"), Timing.linear, Time("0"), IterationCount.infinite)
//            child("&:after") {
//                content= QuotedString(" ")
//                position= Position.absolute
//                top = LinearDimension("2000")
//                width = LinearDimension("20")
//                height = LinearDimension("20")
//                borderRight = "50%"
//                background = "Red"
//            }
//
//
//            child("animStar"){
//                child("from"){
//                    put("transform","translateY(-2000px)")
//                }
//                child("to"){
//                    put("transform","translateY(0px)")
//                }
//            }
//            }
//        }
    }


    fun BoxShadow.getBox(n:Int){

    }

    val parallax by css{
        background="blue"
    }}

    fun RBuilder.div() {
        styledDiv {
            css {
                +ComponentStyles.parallax
            }

            +"An element"
        }

}
