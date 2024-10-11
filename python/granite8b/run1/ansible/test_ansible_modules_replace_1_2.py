import unittest
from ansible.modules.replace import replace


class TestReplaceModule(unittest.TestCase):
    def test_replace_all_instances(self):
        module = AnsibleModule(
            argument_spec=dict(
                path=dict(type='path', required=True),
                regexp=dict(type='str', required=True),
                replace=dict(type='str', required=True),
            ),
            supports_check_mode=True,
        )
        result = replace(module)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

    def test_replace_after_expression(self):
        module = AnsibleModule(
            argument_spec=dict(
                path=dict(type='path', required=True),
                after=dict(type='str', required=True),
                regexp=dict(type='str', required=True),
                replace=dict(type='str', required=True),
            ),
            supports_check_mode=True,
        )
        result = replace(module)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old_string')
        self.assertEqual(result['diff']['after'], 'new_string')

    def test_replace_no_changes(self):
        module = AnsibleModule(
            argument_spec=dict(
                path=dict(type='path', required=True),
                regexp=dict(type='str', required=True),
                replace=dict(type='str', required=True),
            ),
            supports_check_mode=True,
        )
        result = replace(module)
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['diff'], None)

if __name__ == '__main__':
    unittest.main()