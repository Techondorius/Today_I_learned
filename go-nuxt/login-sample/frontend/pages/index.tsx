import { useRef, useState } from 'react'
import SubTest from '../components/SubTest'

export default function Home() {
  const [msg, setMsg] = useState('asdf')

  // const changeMsg = setMsg(() => {
  // 	return "Hello";
  // });
  const a = 1
  return (
    <>
      <h1>{msg}</h1>
      <SubTest msg={'SubTest'} />
    </>
  )
}
