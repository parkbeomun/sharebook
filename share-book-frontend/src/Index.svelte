<script lang="ts">
    import { Router, Link, Route } from "svelte-routing"
    import Home from "./routes/Home.svelte"
    import About from "./routes/About.svelte"
    import Blog from "./routes/Blog.svelte"
    import ApiTest from "./routes/sample/ApiTest.svelte"
    import SampleCrudTest from "./routes/sample/SampleCrudTest.svelte"

    export let url = "";
</script>
<Router url="{url}">
    <nav>
        <Link to="/">Home</Link>
        <Link to="about">About</Link>
        <Link to="blog">Blog</Link>
        <Link to="apiTest">ApiTest</Link>
        <Link to="sampleCrudTest">SampleCrudTest</Link>
    </nav>
    <div>
        <Route path="blog" component="{Blog}" />
        <Route path="about" component="{About}" />
        <Route path="/"><Home /></Route>
        <Route path="/sampleCrudTest"><SampleCrudTest/></Route>
    </div>
</Router>


