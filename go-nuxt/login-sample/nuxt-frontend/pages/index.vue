<script setup lang="ts">
	const NewName = ref("");

	const Count = ref(0);
	const CountUp = () => {
		Count.value++;
	};
	const CountDown = () => {
		Count.value--;
	};

	const url = "http://backend:8080/getJWT";

	interface res {
		token: string;
	}

	const { data: body1 } = await useFetch<res>(url);

	let token: string;
	if (body1.value) {
		token = body1.value.token;
		console.log(body1.value.token);
	} else {
		token = "";
	}

	const { data: body } = await useFetch("http://backend:8080/checkJWT", {
		headers: { token: token },
	});

	if (body.value) {
		console.log(body.value);
	}
</script>

<template>
	<div>
		<h1>Hello World</h1>
		<p>{{ NewName }}</p>
		<input v-model="NewName" />
		<p>{{ Count }}</p>
		<button @click="CountUp">CountUp</button>
		<button @click="CountDown">CountDown</button>
		<p>{{ body }}</p>
	</div>
</template>
