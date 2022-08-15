type Props = {
    title: string
    subtitle: string
    imageOn?: boolean
}

const Hero = (props: Props) => {
    const {title, subtitle, imageOn=false} = props
    console.log(imageOn)
    return(
        <div>
            <h1>{title}</h1>
            <p>{subtitle}</p>
            {imageOn && <figure>[画像]</figure>}
        </div>
    )
}
export default Hero