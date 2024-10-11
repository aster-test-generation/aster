from ansible.module_utils.common.parameters import AnsibleValidationErrorMultiple
import unittest
from ansible.module_utils.common.parameters import _validate_sub_spec


class TestParameters(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {
            'param1': {
                'type': 'dict',
                'options': {
                    'subparam1': {
                        'type': 'str'
                    },
                    'subparam2': {
                        'type': 'int'
                    }
                }
            },
            'param2': {
                'type': 'list',
                'elements': 'dict',
                'options': {
                    'subparam1': {
                        'type': 'str'
                    },
                    'subparam2': {
                        'type': 'int'
                    }
                }
            }
        }
        parameters = {
            'param1': {
                'subparam1': 'value1',
                'subparam2': 10
            },
            'param2': [
                {
                    'subparam1': 'value2',
                    'subparam2': 20
                },
                {
                    'subparam1': 'value3',
                    'subparam2': 30
                }
            ]
        }
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

if __name__ == '__main__':
    unittest.main()