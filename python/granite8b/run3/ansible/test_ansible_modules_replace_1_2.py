import unittest
from ansible.modules.replace import replace


class TestReplace(unittest.TestCase):
    def test_replace_all_instances(self):
        module = AnsibleModule(params={
            'path': '/tmp/test.txt',
            'regexp': 'old',
            'replace': 'new'
        })
        contents = 'old old old'
        result = replace(module, contents)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old old old')
        self.assertEqual(result['diff']['after'], 'new new new')
        self.assertEqual(result['content'], 'new new new')

    def test_replace_after_expression(self):
        module = AnsibleModule(params={
            'path': '/tmp/test.txt',
            'after': 'old',
            'regexp': 'new',
            'replace': 'newer'
        })
        contents = 'old old old\nnew new new'
        result = replace(module, contents)
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['diff']['before'], 'old old old\nnew new new')
        self.assertEqual(result['diff']['after'], 'old old old\nnewer new new')
        self.assertEqual(result['content'], 'old old old\nnewer new new')

    def test_replace_no_changes(self):
        module = AnsibleModule(params={
            'path': '/tmp/test.txt',
            'regexp': 'old',
            'replace': 'new'
        })
        contents = 'old old old'
        result = replace(module, contents)
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['diff']['before'], 'old old old')
        self.assertEqual(result['diff']['after'], 'old old old')
        self.assertEqual(result['content'], 'old old old')

if __name__ == '__main__':
    unittest.main()