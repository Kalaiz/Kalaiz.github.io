package body

import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.css.properties.*
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv
import styled.styledImg


class Contact: RComponent<RProps, RState>() {

    private val contactIconLink =
        linkedStringMapOf(
            "linkedin" to "https://www.linkedin.com/in/skalaiarasan/",
            "stack-overflow" to "https://stackoverflow.com/users/11200630/kalai?tab=profile",
            "github" to "https://github.com/Kalaiz",
            "email" to "mailto:ssokalai@gmail.com",
            "resume" to "https://drive.google.com/file/d/1h3_0yM2sqoSTaD789qUPQd4jOCj3pQdv/view?usp=sharing")

    override fun RBuilder.render() {

        val boxShadowsContact = BoxShadows()
            .apply{plusAssign(BoxShadow(false,0.5.vmin,0.35.vmin,0.45.vmin,0.45.vmin, Color.black)) }

        styledDiv {
            for ((icon,link) in contactIconLink){
                styledImg {

                    css{
                        /*Pop up animation; Hover doesn't work on Mobile devices*/
                        media("(hover: hover) and (pointer: fine)") {
                            transition("all",.2.s, Timing.ease)
                            hover {
                                transform{ translateY((-0.75).vmin)
                                    scale(1.10)
                                    attrs{
                                        src="images/$icon.png"
                                        onClickFunction = {
                                            window.open(link)
                                        }
                                    }
                                }
                            }
                        }

                        +ComponentStyles.tint
                        width= LinearDimension.auto
                        height=7.vmin
                        marginLeft=3.vmin
                        marginRight=3.vmin
                    }
                }
            }

            css {
                marginTop = 4.vmin // Some spacing
                padding(vertical = 3.vmin,horizontal = 2.vmin)
                borderRadius = 10.vmin
                boxShadow = boxShadowsContact
                height = LinearDimension.fitContent
                background= Color.darkSlateGray.toString()
            }
        }
    }
}
