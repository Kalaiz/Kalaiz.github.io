
import kotlinx.css.*
import kotlinx.css.properties.*
import kotlinx.css.properties.IterationCount.Companion.infinite
import org.w3c.dom.svg.SVGLinearGradientElement
import react.RComponent
import react.RProps
import react.RState
import react.RBuilder
import react.dom.html
import styled.*

import kotlin.random.Random

const val TOP = 2000

class App:RComponent<RProps,RState>() {

private val boxShadowsSmall: BoxShadows by lazy { getBoxShadows(500, Color.antiqueWhite)}
    private val boxShadowsMedium: BoxShadows by lazy { getBoxShadows(100, Color.white)}


    override fun RBuilder.render() {

        styledDiv{
            styledDiv{
                css {
                    width= 2.px
                    height= 2.px
                    borderRadius= 50.pct
                    background= "transparent"
                    boxShadow = boxShadowsSmall
                   animation("animStar", 250.s, Timing.linear,iterationCount = infinite)
                        after {
                            content= QuotedString(" ")
                            position=Position.absolute
                            top=TOP.px
                            width= 1.5.px
                            height= 1.5.px
                            borderRadius = 50.pct
                            background = "transparent"
                            boxShadow=boxShadowsSmall
                        }
                }
            }
            styledDiv{
                css{
                    width= 3.px
                    height= 3.px
                    borderRadius= 50.pct
                    background= "transparent"
                    boxShadow = boxShadowsMedium
                    animation("animStar", 400.s, Timing.linear,iterationCount = infinite)
                    after {
                        content= QuotedString(" ")
                        position=Position.absolute
                        top=TOP.px
                        width= 3.px
                        height= 3.px
                        borderRadius = 50.pct
                        background = "transparent"
                        boxShadow=boxShadowsMedium
                    }

                }

            }
            styledDiv{

            }


            /* For Animation*/
            injectGlobal("  @keyframes animStar {\n" +
                    "    from {\n" +
                    "      transform: translateY(0px);\n" +
                    "    }\n" +
                    "  \n" +
                    "    to {\n" +
                    "      transform: translateY(${-TOP}px);\n" +
                    "    }\n" +
                    "  }")
          }


    }






    private fun getRandomInt(until:Int):LinearDimension= Random.nextInt(until).px



    private fun getBoxShadows(n:Int,color:Color): BoxShadows {
        val boxShadows = BoxShadows()
        for (i in  0..n){
            boxShadows.plusAssign(
                BoxShadow(false,
                    getRandomInt(2000),
                    getRandomInt(2000),
                    0.px,1.px, color)
            )
        }
        return boxShadows
    }

    private fun getRandomColor(){
        /*TODO */
    }

}