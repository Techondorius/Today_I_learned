import Link from "next/link"

export default function Nav(){
    return (
        <nav>
            <ul>
                <li>
                    <Link href="/about">
                        <a>about</a>
                    </Link>
                </li>
                <li>
                <Link href="/blog">
                        <a>blog</a>
                    </Link>
                </li>
            </ul>
        </nav>
    )
}