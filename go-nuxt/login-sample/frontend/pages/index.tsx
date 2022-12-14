import React, { useRef, useState } from 'react'
import SubTest from '@/components/SubTest'

export default function Home() {
  const [msg, setMsg] = useState('asdf')
  const [count, setCount] = useState<number>(0)

  const addCount = (n: number) => {
    setCount(count + n)
  }

  const updateMsg = (newMsg: string) => {
    setMsg(newMsg)
  }

  const inputField = useRef<HTMLInputElement>(null)
  const handleClick = () => {
    if (inputField.current) {
      updateMsg(inputField.current.value)
      console.log(inputField.current.value)
    }
  }

  return (
    <>
      <p>{count}</p>
      <button
        onClick={() => {
          addCount(1)
        }}
      >
        CountUp
      </button>
      <button
        onClick={() => {
          addCount(-1)
        }}
      >
        CountDown
      </button>
      <h1>{msg}</h1>
      <input type='text' ref={inputField} />
      <button onClick={handleClick}>Touch Me!</button>
      <SubTest msg={'SubTest'} />
    </>
  )
}
