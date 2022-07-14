import axios from 'axios'

const get = (params) => {

    axios.get(params.url, {
        params: params.params
    })
    .then((res) => {
        return res;
    })
    .catch((err) => {
        console.error(err)
    })
}

const post = (params) => {

    axios.post(params.url, params)
    .then( (response) => {
        console.log(response)
    })
    .catch( (err) => {
        console.error(err)
    })
}

export {get, post};
