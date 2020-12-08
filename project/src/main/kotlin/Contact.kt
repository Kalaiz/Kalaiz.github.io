import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.css.properties.BoxShadow
import kotlinx.css.properties.BoxShadows
import kotlinx.css.properties.transform
import kotlinx.css.properties.translateY
import kotlinx.html.js.onClickFunction
import kotlinx.html.onClick
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv
import styled.styledImg


class Contact: RComponent<RProps, RState>() {

    private val contactIconLink = linkedStringMapOf("linkedin" to "https://www.linkedin.com/in/skalaiarasan/","stack-overflow" to "https://stackoverflow.com/users/11200630/kalai?tab=profile","github" to "https://github.com/Kalaiz","email" to "mailto:ssokalai@gmail.com","resume" to "resume.pdf")
    override fun RBuilder.render() {

        val boxShadowsContact = BoxShadows()
            .apply{plusAssign(BoxShadow(false,3.px,3.px,5.px,5.px, Color.black)) }
        styledDiv {

            for ((icon,link) in contactIconLink){
                styledImg {
                    attrs{
                        src="/images/$icon.png"
//                        onClick= "window.open($link)"
                    }
                    css{
                        hover {
                            transform{ translateY((-2).px)}
                        }
                        filter="brightness(0) saturate(100%) invert(100%) sepia(100%) saturate(0%) hue-rotate(8deg) brightness(105%) contrast(101%)"
                        width= LinearDimension.auto
                        height=5.vmin
                        marginLeft=1.vmin
                        marginRight=1.vmin
                    }
                }
            }

            css {
                padding(vertical = 2.vmin,horizontal = 2.vmin)
                borderRadius= 10.vmin
                boxShadow=boxShadowsContact
                height = LinearDimension.fitContent
                background= Color.darkSlateGray.toString()
            }
        }
    }


}
