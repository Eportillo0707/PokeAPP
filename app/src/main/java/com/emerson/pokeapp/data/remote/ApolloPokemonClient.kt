package com.emerson.pokeapp.data.remote

import com.apollographql.apollo3.ApolloClient

class ApolloPokemonClient {
    private val apolloClient = ApolloClient.Builder()
        .serverUrl("https://beta.pokeapi.co/graphql/v1beta")
        .build()

    fun getApolloClient(): ApolloClient = apolloClient
}