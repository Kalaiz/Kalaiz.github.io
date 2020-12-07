import kotlinx.browser.document
import kotlinx.css.*
import org.w3c.dom.svg.SVGRadialGradientElement
import react.dom.render
import styled.css
import styled.injectGlobal
import styled.styledH1

const val ellipseColor = "#37577d"
const val backgroundBaseColor = "#162157"
fun main() {

    val htmlTagCSSBuilder = CSSBuilder()
    htmlTagCSSBuilder.apply {
        html {
            height = 100.pct
            background = "radial-gradient(ellipse at bottom, $ellipseColor 30%, $backgroundBaseColor 100%)"
            overflowY = Overflow.auto
        }
    }

    injectGlobal(htmlTagCSSBuilder.toString())

    render(document.getElementById("root")) {
        styledH1 {
            +"Hi! I am Kalai."
            css {
                color = Color.whiteSmoke
                fontFamily = "Courier New"
                position = Position.absolute
                top = 40.pct
                left = 0.px
                right = 0.px
                textAlign = TextAlign.center
            }
        }

        child(MovingBackGround::class) {}

    }
}







