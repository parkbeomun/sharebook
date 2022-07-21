<script lang="ts">
    import {get, post} from '/src/assets/js/api.js'

    function handleClick () {
      get()
    }
</script>
<main>
    <button on:click={handleClick}>API TEST</button>
</main>


