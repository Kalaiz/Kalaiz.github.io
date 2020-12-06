import kotlinx.css.*
import kotlinx.css.properties.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv
import kotlin.random.Random


class App:RComponent<RProps,RState>() {
        private val BoxShadow by lazy { getBoxShadows(1000) }
    override fun RBuilder.render() {
        styledDiv {
            css{}
        }


    }

    private fun getRandomInt(until:Int):LinearDimension= Random.nextInt(until).px



    private fun getBoxShadows(n:Int): BoxShadows {
        val boxShadows = BoxShadows()
        for (i in  0..n){
            boxShadows.plusAssign(BoxShadow(true,
                getRandomInt(2000),
                getRandomInt(2000),
                1.px,1.px, Color.red))
        }
        return boxShadows
    }



}/* boxShadow(Color.aqua,
                    LinearDimension(getRandomInt(2000)),
                    LinearDimension(getRandomInt(2000)),LinearDimension("20"),LinearDimension("20"))*/