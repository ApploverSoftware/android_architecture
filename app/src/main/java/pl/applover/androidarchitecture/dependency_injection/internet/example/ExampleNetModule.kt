package pl.applover.androidarchitecture.dependency_injection.internet.example

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import pl.applover.androidarchitecture.BuildConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class ExampleNetModule {
    internal var webServiceUrl = "https://jsonplaceholder.typicode.com/"
    private val timeoutInSec = 10


    @Provides
    @Named("example")
    @Singleton
    internal fun provideRetrofit(): Retrofit {
        val logging = HttpLoggingInterceptor()
        logging.level = if (BuildConfig.DEBUG)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE

        val okHttpClient = OkHttpClient.Builder()
                .addNetworkInterceptor(logging)
                .addInterceptor(logging)
                .writeTimeout(timeoutInSec.toLong(), TimeUnit.SECONDS)
                .readTimeout(timeoutInSec.toLong(), TimeUnit.SECONDS)
                .build()

        return Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl(webServiceUrl)
                .client(okHttpClient)
                .build()
    }
}
