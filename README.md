# Tensorflow Scala Native
Scala Native bindings to Tensorflow C API

## Usage
You need to install tensorflow for you platform. Then you have to put the tensorflow C lib in your library path.
You can download the C lib from this link: [Install TensorFlow for C](https://www.tensorflow.org/install/lang_c).
But to have the latest version you have to change the version in the links from `1.12.0` to `1.13.1`.
Remember to match the platform (GPU or CPU) with your tensorflow installation, or instead it won't work.

## Next step
Implement an higher level Api based on `CApi.scala` bindings
