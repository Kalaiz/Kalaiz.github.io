import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h3
import styled.css
import styled.styledDiv

class App:RComponent<RProps,RState>() {

    override fun RBuilder.render() {
        styledDiv {
            css {
               +ComponentStyles.wrapper
            }


            h3{
                +"Heading"
            }
        }


    }


}