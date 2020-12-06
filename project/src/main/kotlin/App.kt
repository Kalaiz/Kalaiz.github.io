
import kotlinx.css.*
import kotlinx.css.properties.*


import kotlinx.css.properties.IterationCount.Companion.infinite


import react.RComponent
import react.RProps
import react.RState
import react.RBuilder

import styled.css
import styled.keyframes
import styled.keyframesName
import styled.styledDiv
import kotlin.random.Random


class App:RComponent<RProps,RState>() {

private val boxShadows: BoxShadows by lazy { getBoxShadows(1000)}

    override fun RBuilder.render() {
        styledDiv{

            styledDiv{
                css {
                    width= 2.px
                    height= 2.px
                    borderRadius= 50.pct
                    background= "transparent"
                    boxShadow = boxShadows
                    animation("animStar", 150.s, Timing.linear,iterationCount = infinite)
                        after {
                            content= QuotedString(" ")
                            position=Position.absolute
                            top=2000.px
                            width= 2.px
                            height= 2.px
                            borderRadius = 50.pct
                            background = "transparent"
                            boxShadow=boxShadows
                        }

                }
            }
            styledDiv{

            }
            styledDiv{

            }

//            css{
//             keyframes("animStar",{
//                 from { transform { translateY((-2000).px) } }
//                 to{transform { translateY(0.px) }}
//             })
//            }
        }




    }

    private fun getRandomInt(until:Int):LinearDimension= Random.nextInt(until).px



    private fun getBoxShadows(n:Int): BoxShadows {
        val boxShadows = BoxShadows()
        for (i in  0..n){
            boxShadows.plusAssign(
                BoxShadow(false,
                    getRandomInt(2000),
                    getRandomInt(2000),
                    0.px,1.px, Color.red)
            )
        }
        return boxShadows
    }

    private fun getRandomColor(){
        /*TODO */
    }

}