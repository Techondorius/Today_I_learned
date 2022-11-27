export default defineNuxtConfig({
  typescript: {
    strict: true
  },
  components: {
    global: true,
    dirs: ['~/components']
  },
})