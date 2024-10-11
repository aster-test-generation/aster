import unittest
from ansible.modules.expect import *



class TestExpect(unittest.TestCase):
    def test_response_closure(self):
        module = AnsibleModule(
            argument_spec=dict(
                command=dict(required=True),
                chdir=dict(type='path'),
                creates=dict(type='path'),
                removes=dict(type='path'),
                responses=dict(type='dict', required=True),
                timeout=dict(type='int', default=30),
                echo=dict(type='bool', default=False),
            )
        )
        question = "question"
        responses = ["response1", "response2", "response3"]
        result = response_closure(module, question, responses)
        self.assertEqual(result, "response1")

if __name__ == '__main__':
    unittest.main()