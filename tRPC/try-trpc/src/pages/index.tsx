import { trpc } from "../utils/trpc";

export default function IndexPage() {
	const hello = trpc.hello.useQuery({ text: "asdf" });
	if (!hello.data) {
		return <div>Loading...</div>;
	}
	return (
		<div>
			<p>{hello.data.greeting}</p>
		</div>
	);
}
