import kotlinx.css.*
import kotlinx.css.properties.BoxShadow
import kotlinx.css.properties.BoxShadows
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.p
import styled.css
import styled.styledDiv



class Contact: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
//        val boxShadowsContact = BoxShadows().plusAssign(BoxShadow(false,))
        styledDiv {
            p{
                +"Contact ........................"
            }
            css {
                padding(0.px,5.pct)
                borderRadius= 25.px
                height = LinearDimension.fitContent
                width= LinearDimension.fitContent
                background= Color.aqua.toString()
            }
        }
    }
}