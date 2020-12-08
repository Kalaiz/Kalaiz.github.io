import body.Body
import kotlinx.browser.document
import kotlinx.css.*
import react.dom.render
import styled.injectGlobal


const val backgroundBaseColor = "#162157"
fun main() {

    val htmlTagCSSBuilder = CSSBuilder()
    htmlTagCSSBuilder.apply {
        html {
            height = 100.pct
            background =  backgroundBaseColor
            overflowY = Overflow.hidden
            overflowX=Overflow.hidden

        }
    }

    injectGlobal(htmlTagCSSBuilder.toString())

    render(document.getElementById("root")) {
        child(MovingBackGround::class) {}
        child(Body::class){}

    }

}







