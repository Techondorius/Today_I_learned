export const App = (props: any) => {
  return (
    <>
      <h1>Hi!</h1>
      <main>
        {props.Children}
      </main>
    </>
  )
}