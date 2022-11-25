<script>
export default {
  data() {
    return {
      message: "Mmmm..."
    }
  },
  mounted() {
    this.$refs.p.textContent = "mounted"
  }
}
</script>

<template>
  <p ref="p">Mounting</p>
</template>