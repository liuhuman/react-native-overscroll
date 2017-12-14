'use strict';

import React, { Component, PropTypes } from 'react';
import { requireNativeComponent} from 'react-native';

var OverScrollNative = requireNativeComponent('OverScroll', OverScroll);

export default class OverScroll extends Component {
  static propTypes = {

  }

  render () {
    return <OverScrollNative {...this.props} />
  }
}
