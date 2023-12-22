<script lang="ts">
	let names = $state([]);

	$effect(() => {
		fetch('https://demo59.fly.dev/api/names')
			.then((res) => res.json())
			.then((data) => (names = data));
	});
</script>

<h1>이름들</h1>

<ul>
	{#each names as name}
		<li>{name}</li>
	{/each}
</ul>
