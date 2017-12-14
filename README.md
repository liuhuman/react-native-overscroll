# react-native-overscroll

[![JavaScript Style Guide](https://cdn.rawgit.com/feross/standard/master/badge.svg)](https://github.com/feross/standard)

## Introduction
OverScroll support bounce feature for Android ScrollView.

## Installation
```
npm install @unpourtous/react-native-overscroll --save
```

## Usage
First, add PopupStub as sibling node of you Root Node
``` js
export default class example extends Component {
  render () {
    return (
      <OverScroll style={styles.container}>
        {/* Your root node */}
        <ScrollView>
          ...
        </ScrollView>
      </OverScroll>
    )
  }
}
```

## License
This library is distributed under MIT Licence.
