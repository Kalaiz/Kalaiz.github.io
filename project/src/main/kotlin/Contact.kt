import kotlinx.css.*
import kotlinx.css.properties.BoxShadow
import kotlinx.css.properties.BoxShadows
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.ReactModule
import styled.css
import styled.styledDiv
import styled.styledP


class Contact: RComponent<RProps, RState>() {

    override fun RBuilder.render() {

       val boxShadowsContact = BoxShadows()
           .apply{plusAssign(BoxShadow(false,3.px,3.px,5.px,5.px, Color.black)) }

        styledDiv {
           styledP{
                +"Contact ........................"
               css{
                   color=Color.whiteSmoke
                   fontWeight= FontWeight.bold
                   fontSize = 3.5.vmin
               }
            }
            css {
                padding(0.px,5.pct)
                borderRadius= 20.px
                boxShadow=boxShadowsContact
                height = LinearDimension.fitContent
                background= Color.darkSlateGray.toString()
            }
        }
    }
}