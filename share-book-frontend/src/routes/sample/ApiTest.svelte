<script lang="ts">
    import {get} from '/src/assets/js/api.js'

    function handleClick () {
      get('http://localhost:9080/sample', function () {

      })
    }
</script>
<main>
    <button on:click={handleClick}>API TEST</button>
</main>


