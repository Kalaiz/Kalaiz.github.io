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

    private val contactIconLink = linkedStringMapOf("linkedin" to "https://www.linkedin.com/in/skalaiarasan/","stack-overflow" to "https://stackoverflow.com/users/11200630/kalai?tab=profile","github" to "https://github.com/Kalaiz","email" to "mailto:ssokalai@gmail.com","resume" to "https://drive.google.com/file/d/1h3_0yM2sqoSTaD789qUPQd4jOCj3pQdv/view?usp=sharing")
    override fun RBuilder.render() {

        val boxShadowsContact = BoxShadows()
            .apply{plusAssign(BoxShadow(false,3.px,3.px,5.px,5.px, Color.black)) }
        styledDiv {

            for ((icon,link) in contactIconLink){
                styledImg {
                    attrs{
                        src="/images/$icon.png"
                        onClickFunction = {
                            window.open(link)
                        }
                    }
                    css{
                        transition("all",.2.s, Timing.ease)
                        hover {
                            transform{ translateY((-0.75).vmin)}
                        }
                        filter="brightness(0) saturate(100%) invert(100%) sepia(100%) saturate(0%) hue-rotate(8deg) brightness(105%) contrast(101%)"
                        width= LinearDimension.auto
                        height=7.vmin
                        marginLeft=3.vmin
                        marginRight=3.vmin
                    }
                }
            }

            css {
                marginTop=4.vmin
                padding(vertical = 3.vmin,horizontal = 2.vmin)
                borderRadius= 10.vmin
                boxShadow=boxShadowsContact
                height = LinearDimension.fitContent
                background= Color.darkSlateGray.toString()
            }
        }
    }


}
