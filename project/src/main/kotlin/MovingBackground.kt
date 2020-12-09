import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.css.properties.*
import kotlinx.css.properties.IterationCount.Companion.infinite
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.injectGlobal
import styled.styledDiv
import kotlin.random.Random



class MovingBackground:RComponent<RProps,RState>() {

    override fun RBuilder.render() {
        val top = window.innerHeight*4
        styledDiv{
            styledDiv{
                val boxShadowsSmall = getBoxShadows((window.innerHeight * window.innerWidth)/750, Color.antiqueWhite, window.innerWidth* 4, window.innerHeight* 4 )
                css {
                    + ComponentStyles.smallStarDim
                    + ComponentStyles.star
                    boxShadow = boxShadowsSmall
                    animation("animStar", 450.s, Timing.linear,iterationCount = infinite)
                    after {
                        position = Position.absolute
                        this.top = top.px
                        + ComponentStyles.smallStarDim
                        + ComponentStyles.star
                        boxShadow = boxShadowsSmall
                    }
                }
            }

            styledDiv{
                val boxShadowsMedium = getBoxShadows((window.innerHeight * window.innerWidth)/1250, Color.white , window.innerWidth * 4, window.innerHeight * 4)
                css{
                    + ComponentStyles.medStarDim
                    + ComponentStyles.star
                    boxShadow = boxShadowsMedium
                    animation("animStar", 650.s, Timing.linear,iterationCount = infinite)
                    after {
                        position=Position.absolute
                        this.top =top.px
                        + ComponentStyles.medStarDim
                        + ComponentStyles.star
                        boxShadow=boxShadowsMedium
                    }
                }
            }

            /* For Animation*/
            injectGlobal("  @keyframes animStar {\n" +
                    "    from {\n" +
                    "      transform: translateY(0px);\n" +
                    "    }\n" +
                    "  \n" +
                    "    to {\n" +
                    "      transform: translateY(${-top}px);\n" +
                    "    }\n" +
                    "  }")
        }
    }




    private fun getRandomInt(until:Int):LinearDimension = Random.nextInt(until).px


    /**
     * Returns the boxShadows based on @param n
     * @param n Number of stars
     * */
    private fun getBoxShadows(n:Int,color:Color,width:Int,height:Int): BoxShadows {
        val boxShadows = BoxShadows()
        for (i in  0..n){
            boxShadows.plusAssign(
                BoxShadow(false,
                    getRandomInt(width),
                    getRandomInt(height),
                    0.px,1.px, color)
            )
        }
        return boxShadows
    }
}
