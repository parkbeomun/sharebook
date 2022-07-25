<script lang="ts">
    import {get, post} from '/src/assets/js/api.js'

    select();



    let people = [
        {first : 'Park', last: 'Beomun'},
        {first : 'Kim', last: 'Dohee'},
        {first : 'Kim', last: 'seongmin'},
    ];

    let prefix = '';
    let first = '';
    let last = '';
    let i = 0;

    $: filteredPeople = prefix
        ? people.filter(person => {
          const name = `${person.last},  ${person.first}`;
          return name.toLowerCase().startsWith(prefix.toLowerCase());
        })
        : people;

    $: selected = filteredPeople[i];

    $: reset_inputs(selected);

    function select() {
      get('http://localhost:9080/people', function (res) {
        console.log(res)
      })
    }

    function reset_inputs(person) {
      first = person ? person.first : '';
      last = person ? person.last : '';
    }

    function create() {
        people = people.concat({ first, last });
        i = people.length - 1;
        first = last = '';
    }

    function update() {
        selected.first = first;
        selected.last = last;
        people = people;
    }

    function remove() {
        const index = people.indexOf(selected);
        people = [...people.slice(0, index), ...people.slice(index + 1)];

        first = last = '';
        i = Math.min(i, filteredPeople.length -2);

    }
</script>
<main>
    <input placeholder="filter prefix" bind:value="{prefix}"/>

    <select bind:value="{i}" size="{5}">
        {#each filteredPeople as person, i}
        <option value="{i}">{person.last}, {person.first}</option>
        {/each}
    </select>

    <label><input bind:value="{first}" placeholder="first"/></label>
    <label><input bind:value="{last}" placeholder="last"/></label>

    <div class="buttons">
        <button on:click="{create}" disabled="{!first || !last}">create</button>
        <button on:click="{update}" disabled="{!first || !last || !selected}">update</button>
        <button on:click="{remove}" disabled="{!selected}">delete</button>
    </div>
</main>

<style>
	* {
		font-family: inherit;
		font-size: inherit;
	}

	input {
		display: block;
		margin: 0 0 0.5em 0;
	}

	select {
		float: left;
		margin: 0 1em 1em 0;
		width: 14em;
	}

	.buttons {
		clear: both;
	}
</style>


